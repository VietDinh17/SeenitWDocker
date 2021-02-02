FROM node:14.15.4 as build

ARG REACT_APP_API_BASE_URL
ENV REACT_APP_API_BASE_URL=${REACT_APP_API_BASE_URL}

WORKDIR /app

COPY package.json .
COPY package-lock.json .

RUN yarn install

COPY . .

RUN yarn build

FROM nginx

COPY ./nginx.conf /etc/nginx/conf.d/default.conf

COPY --from=build /app/build /usr/share/nginx/html

ENTRYPOINT ["nginx","-g","daemon off;"]
