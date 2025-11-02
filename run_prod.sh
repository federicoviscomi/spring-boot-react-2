#!/bin/bash
set -x
docker compose --env-file .env.prod -f docker-compose-prod.yml down -v
docker compose --env-file .env.prod -f docker-compose-prod.yml up --build
