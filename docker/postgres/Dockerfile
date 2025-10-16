
FROM postgres

ENV TZ=America/Sao_Paulo

ENV POSTGRES_DB=rickmorty
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=123456
EXPOSE 5432

COPY backup.sql /docker-entrypoint-initdb.d/01_backup.sql
