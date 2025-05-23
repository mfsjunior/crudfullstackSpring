# Etapa 1: build do Angular
FROM node:18 as build-stage
WORKDIR /app

# Copia os arquivos de dependência primeiro
COPY package*.json ./

# Instala dependências e Angular CLI
RUN npm install --legacy-peer-deps
RUN npm install -g @angular/cli

# Copia o restante do código
COPY . .

# Compila o projeto Angular
RUN ng build --configuration production

# Etapa 2: nginx para servir os arquivos Angular compilados
FROM nginx:alpine
COPY --from=build-stage /app/dist/* /usr/share/nginx/html/
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
