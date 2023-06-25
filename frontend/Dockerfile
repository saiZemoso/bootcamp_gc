FROM node:14-alpine

WORKDIR /react_app

COPY package*.json ./

COPY . .

EXPOSE 8080

ENTRYPOINT [ "npm","start"]