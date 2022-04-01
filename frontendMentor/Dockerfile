FROM node:16.13.1-alpine3.13

ENV LANG=C.UTF-8
ENV NODE_VERSION 16.13.1
ENV NODE_MODULES=/usr/local/node_modules
ENV PATH=/usr/local/node_modules/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin

RUN mkdir -p "$NODE_MODULES" && chmod 777 "$NODE_MODULES"
RUN apk add --no-cache build-base gcc bash cmake git

RUN npm install -g npm@8.3.0 \
# when running the image to install react the tar package throw an error 
  && npm install tar@6 -g \ 
  && npm cache clean --force \
  # && npm init -y \
  && git init 

EXPOSE 3000

WORKDIR /app

ENTRYPOINT ["npx"]

CMD ["help"]