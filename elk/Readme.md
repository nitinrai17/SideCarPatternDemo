wsl -d docker-desktop
sysctl -w vm.max_map_count=262144



##docker build:-  

docker build . --tag local-elk


##docker run :- 
docker run -p 5601:5601 -p 9200:9200 -p 5044:5044 -it --name elk local-elk


##for checking purpose :-
http://localhost:9200/_cat/indices