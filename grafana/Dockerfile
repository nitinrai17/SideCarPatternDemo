FROM grafana/grafana

COPY datasource.yml /etc/grafana/provisioning/datasources/datasource.yml

ENV GF_SECURITY_ADMIN_PASSWORD=password

ENV GF_USERS_ALLOW_SIGN_UP=false

EXPOSE 3000
