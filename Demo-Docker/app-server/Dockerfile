FROM node:14
EXPOSE 3000
WORKDIR /app

RUN npm i npm@latest -g
COPY package.json package-lock.json* ./

RUN npm install

# Copy folder build to folder current docker
COPY . .

# Run node app.js
CMD ["node", "app.js"] 