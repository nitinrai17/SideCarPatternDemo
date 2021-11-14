FROM sebp/elk

RUN echo 'vm.max_map_count=262144' >> /etc/sysctl.conf

RUN rm  /etc/logstash/conf.d/30-output.conf
COPY 30-output.conf /etc/logstash/conf.d/30-output.conf

RUN rm /etc/logstash/conf.d/02-beats-input.conf
COPY 02-beats-input.conf /etc/logstash/conf.d/02-beats-input.conf

EXPOSE 5601

EXPOSE 9200

EXPOSE 5044
