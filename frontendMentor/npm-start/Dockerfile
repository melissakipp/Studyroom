FROM node:16.13.1-alpine3.13 as node

ENV NODE_VERSION 16.13.1
ENV NPM_VERSION 8.3.0

RUN addgroup -g 1000 node \
    && adduser -u 1000 -G node -s /bin/sh -D node 
#     && apk add --no-cache \
#         libstdc++ 
# RUN ln -s /usr/local/bin/node /usr/local/bin/nodejs

# RUN apk add --no-cache build-base bash git

ENV NODE_MODULES=/usr/local/node_modules

ENV PATH=/usr/local/node_modules/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin

RUN mkdir -p "$NODE_MODULES" && chmod 777 "$NODE_MODULES"

RUN npm install -g npm@8.3.0 \
  && node --version \
  && npm --version \
  && npm init -y 


EXPOSE 3000

WORKDIR /app

ENTRYPOINT ["npx"]

CMD ["help"]


# FROM node as npm-start

# COPY docker-entrypoint.sh /usr/local/bin/

# ENTRYPOINT [ "docker-entrypoint.sh" ]

# CMD [ "node" ]