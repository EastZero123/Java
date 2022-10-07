package info.thecodinglive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.thecodinglive.model.TodoEntity;
import info.thecodinglive.persistence.TodoRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public String testService() {

		TodoEntity entity = TodoEntity.builder().title("My first todo item").build();

		repository.save(entity);

		TodoEntity savedEntity = repository.findById(entity.getId()).get();

		return savedEntity.getTitle();

	}

	public List<TodoEntity> create(final TodoEntity entity) {
		validate(entity);

		repository.save(entity);

		log.info("Entity Id : {} is saved", entity.getId());

		return repository.findByUserId(entity.getUserId());
	}

	private void validate(final TodoEntity entity) {
		if (entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		if (entity.getUserId() == null) {
			log.warn("Unknown user.");
			throw new RuntimeException("Unknown user");
		}
	}

	public List<TodoEntity> retrieve(final String userId) {
		return repository.findByUserId(userId);
	}

	public List<TodoEntity> update(final TodoEntity entity) {
		validate(entity);

		final Optional<TodoEntity> original = repository.findById(entity.getId());

		if (original.isPresent()) {
			final TodoEntity todo = original.get();
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());

			repository.save(todo);
		}

		return retrieve(entity.getUserId());
	}

	public List<TodoEntity> delete(final TodoEntity entity) {
		validate(entity);

		try {
			repository.delete(entity);
		} catch (Exception e) {
			// TODO: handle exception
			log.error("error deleting entity ", entity.getId(), e);

			throw new RuntimeException("error deleting entity " + entity.getId());
		}

		return retrieve(entity.getUserId());
	}
}
