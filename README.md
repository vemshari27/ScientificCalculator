ScientificCalculator
====================
Access the webapp:
1. Pull the latest image: `docker pull vemshari27/scientific_calculator:latest`
2. Run the container: `docker run -p 8000:8080 --name scal scientific_calculator:latest`
3. Get the container's IP: `docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' scal`
4. Go to [172.17.0.2:8080/ScientificCalculator-1.0-SNAPSHOT](), if that is the conatiner's IP. Put the IP from step 3 at the begining.