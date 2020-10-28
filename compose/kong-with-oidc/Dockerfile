FROM kong:latest

USER root

RUN luarocks install lua-resty-openidc
RUN luarocks install kong-oidc

USER kong
