## Overview
Spring徹底入門の練習用リポジトリになります。  
著者によるサンプルコードは[こちら](https://github.com/making/mrs)


## Set up postgres

```
# install
brew install postgresql

# check
postgres --version

# start up(shutdown) postgres
brew services start(stop) postgresql

# LOGIN
psql postgres

# CREATE ROLE
CREATE ROLE com LOGIN
ENCRYPTED PASSWORD 'md586082399b5082acb54472ee195a57ce8'
NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;

# CREATE DATABASE
CREATE DATABASE com
WITH OWNER = com
ENCODING = 'UTF8'
TABLESPACE = pg_default
LC_COLLATE = 'C'
LC_CTYPE = 'C'
TEMPLATE = 'template0'
CONNECTION LIMIT = -1;
```
