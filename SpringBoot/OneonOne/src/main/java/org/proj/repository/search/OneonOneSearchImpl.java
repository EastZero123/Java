package org.proj.repository.search;

import java.util.List;

import org.proj.vo.OneonOne;
import org.proj.vo.QOneonOne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.JPQLQuery;

public class OneonOneSearchImpl extends QuerydslRepositorySupport implements OneonOneSearch {

	public OneonOneSearchImpl() {
		super(OneonOne.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Page<OneonOne> search1(Pageable pageable) {
		// TODO Auto-generated method stub

		QOneonOne oneonOne = QOneonOne.oneonOne;

		JPQLQuery<OneonOne> query = from(oneonOne);

		BooleanBuilder booleanBuilder = new BooleanBuilder();

		booleanBuilder.or(oneonOne.title.contains("11"));

		booleanBuilder.or(oneonOne.content.contains("11"));

		query.where(booleanBuilder);
		query.where(oneonOne.tno.gt(0L));

		query.where(oneonOne.title.contains("1"));

		this.getQuerydsl().applyPagination(pageable, query);

		List<OneonOne> list = query.fetch();

		Long count = query.fetchCount();

		return null;
	}

	@Override
	public Page<OneonOne> searchAll(String[] types, String keyword, Pageable pageable) {
		// TODO Auto-generated method stub
		QOneonOne oneonOne = QOneonOne.oneonOne;
		JPQLQuery<OneonOne> query = from(oneonOne);

		if ((types != null && types.length > 0) && keyword != null) { // 검색 조건과 키워드가 있다면

			BooleanBuilder booleanBuilder = new BooleanBuilder(); // (

			for (String type : types) {

				switch (type) {
				case "t":
					booleanBuilder.or(oneonOne.title.contains(keyword));
					break;
				case "c":
					booleanBuilder.or(oneonOne.content.contains(keyword));
					break;
				case "w":
					booleanBuilder.or(oneonOne.writer.contains(keyword));
					break;
				}
			} // end for
			query.where(booleanBuilder);
		} // end if

		// bno > 0
		query.where(oneonOne.tno.gt(0L));

		// paging
		this.getQuerydsl().applyPagination(pageable, query);

		List<OneonOne> list = query.fetch();

		long count = query.fetchCount();

		return new PageImpl<>(list, pageable, count);
	}

}
