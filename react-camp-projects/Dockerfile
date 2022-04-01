# Resource: https://github.com/BretFisher/node-docker-good-defaults
FROM node:16.13.1-alpine3.14

ARG NODE_ENV=development

RUN apk add --no-cache bash

RUN npm i npm@latest -g 

RUN mkdir /opt/node_app && chown node:node /opt/node_app
WORKDIR /opt/node_app

USER node
COPY --chown=node:node package.json package-lock.json* ./
RUN npm install --no-optional && npm cache clean --force
ENV PATH /opt/node_app/node_modules/.bin:$PATH

WORKDIR /opt/node_app/app
COPY --chown=node:node . .

EXPOSE 3000

CMD [ "npm", "start" ]