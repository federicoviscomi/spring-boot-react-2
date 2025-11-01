FROM node:20-alpine

RUN apk add --no-cache curl

WORKDIR /app

# Install dependencies first for caching
COPY package*.json ./
RUN npm install

# Copy the rest of the code
COPY . .

EXPOSE 5173

CMD ["npm", "run", "dev"]
