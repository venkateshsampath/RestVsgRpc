# RestVsgRpc
A repository containing a deployable client/server sample for REST and gRPC using Java for comparison and demonstration purposes.

The goal is to publish 100 entites to a database, and GET the entity after
creating it, resulting in roughly 200 entities being written and read from a remote database over a RESTful interface, as well as a gRPC interface.

## TODO

- [ ] Define shared spec that REST API and gRPC will test with (moderate size)
- [ ] Rest API server with GET/POST endpoints
- [ ] Rest API client that calls itself
- [ ] Rest API client takes CLI args to target
- [ ] Rest API client is wrapped in timer, prints out result time
---------------------------
- [ ] gRPC server with accept/read endpoints
- [ ] gRPC client that calls itself
- [ ] gRPC client that takes CLI args to target
- [ ] gRPC client is wrapped in timer, prints out result time
---------------------------
- [ ] Build script results in runnable binary
- [ ] Deploy in remote EC2, call from local and test timing to do X requests
- [ ] Run many intervals and document
- [ ] Docker configuration that will deploy postgres instance both apps will connect to using their respective DB connection strategies.

- [ ] Add writeup into seperate README file
- [ ] Write article for publish with simple results