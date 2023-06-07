# E-commerce_website-in-java

## Instructions

### 1. Cloning and starting the containers

1. If you don't have Docker/docker-compose installed, just install [Docker Desktop](https://www.docker.com/products/docker-desktop/).
2. Clone the project and open the root directory in the terminal (the root directory is the one with docker-compose.yml in it).
4. Run `docker-compose up` to start the containers. (It might take a while for it to start up the first time because Docker has to download the three images and the jdk-11 one especially takes a while to download). 
5. Run `docker-compose down` to remove them (should not be necessary).

#### Optional
If you install [make](https://formulae.brew.sh/formula/make) on your system, you can run `make up` and `make down` from the terminal in the root directory instead of `docker-compose up` and `docker-compose down`.

### 2. Accessing stuff

#### App
- You can access the app at [localhost:8080](http://localhost:8080/).
    - Username is `admin`
    - Password is `admin`

#### Adminer
- You can access Adminer at [localhost:8081](http://localhost:8081/).
    - System is `mysql`
    - Server is `db`
    - Username is `admin`
    - Password is `password`
    - Database is `springproject`

### Etc.

Unfortunately there's no hot reloading so you have to recompile everything every time you make a change which can take some time.