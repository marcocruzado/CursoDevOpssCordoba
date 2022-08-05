FROM node:16

WORKDIR /usr/src/app

COPY package*.json ./
RUN npm install &&  npm ci --omit=dev --only=production

COPY . .

EXPOSE 8080
CMD [ "node", "server.js" ]

#diferencia entre el cmd y el entrypoint
#entrypoint: se ejecuta antes de ejecutar el comando
#cmd: se ejecuta despues de ejecutar el comando
