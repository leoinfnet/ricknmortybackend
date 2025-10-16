FROM postgres

# Ajuste se quiser outro fuso
ENV TZ=America/Sao_Paulo

# DB, user e senha padrão (pode sobrescrever em runtime)
ENV POSTGRES_DB=rickmorty
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=123456

# Qualquer .sql dentro desta pasta roda automaticamente na 1ª inicialização
COPY backup.sql /docker-entrypoint-initdb.d/01_backup.sql