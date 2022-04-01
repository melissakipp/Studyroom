FROM node:16.13.1-alpine3.14

EXPOSE 3000


ARG NODE_ENV=development

RUN apk add --no-cache bash

RUN npm i npm@latest -g 

WORKDIR /opt/node_app
RUN chown node:node /opt/node_app

USER node
COPY --chown=node:node package.json package-lock.json* ./
RUN npm install --no-optional && npm cache clean --force
ENV PATH /opt/node_app/node_modules/.bin:$PATH

WORKDIR /opt/node_app/app
COPY --chown=node:node . .

CMD [ "node", "./src/index.js" ]