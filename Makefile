.PHONY: up stop down

up:
	docker compose -f compose.yaml up -d

stop:
	docker compose -f compose.yaml stop

down:
	docker compose -f compose.yaml down
