--liquibase formatted sql

-- changeset max:01
-- another update
update liquibase.persons
set birthday='2012-02-02'
where id=5
;

-- changeset max:02
-- another update
update liquibase.persons
set birthday='2013-03-03'
where id=10
;


-- changeset max:03
-- another update
update liquibase.persons
set birthday='2000-03-03'
where id=1
;

-- changeset max:04 cloumnName:birthday
-- another update
update liquibase.persons
set birthday='2002-02-02'
where id=2
;