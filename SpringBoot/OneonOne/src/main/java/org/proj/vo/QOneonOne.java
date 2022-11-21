package org.proj.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOneonOne is a Querydsl query type for OneonOne
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOneonOne extends EntityPathBase<OneonOne> {

    private static final long serialVersionUID = 247603663L;

    public static final QOneonOne oneonOne = new QOneonOne("oneonOne");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final StringPath title = createString("title");

    public final NumberPath<Long> tno = createNumber("tno", Long.class);

    public final StringPath writer = createString("writer");

    public QOneonOne(String variable) {
        super(OneonOne.class, forVariable(variable));
    }

    public QOneonOne(Path<? extends OneonOne> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOneonOne(PathMetadata metadata) {
        super(OneonOne.class, metadata);
    }

}

