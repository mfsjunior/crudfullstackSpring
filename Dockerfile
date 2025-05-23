# angular-generator/Dockerfile
FROM node:20

WORKDIR /app

RUN npm install -g @angular/cli

# Comando padrão: cria o projeto
CMD ["sh", "-c", "ng new frontend --defaults --skip-git && ls"]
