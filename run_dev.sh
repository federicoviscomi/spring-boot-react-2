#!/bin/bash
set -x
docker compose --env-file .env.dev -f docker-compose-dev.yml down -v
docker compose --env-file .env.dev -f docker-compose-dev.yml up --build
