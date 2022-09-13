# Liquibase
Liquibase and Spring Boot

use sql script

Refer to https://www.bilibili.com/video/BV1ii4y1P73H?spm_id_from=333.337.search-card.all.click

1.get
http://localhost:8080/person/person

2.post
http://localhost:8080/person/person?name=Milly

Refer to https://docs.liquibase.com/concepts/changelogs/sql-format.html

use sql format file and can add more sql script in one file.

for example: changelog-DML-03.sql

at the top of the file, we must input

--liquibase formatted sql

and then use the format "changeset <author>:<id>"