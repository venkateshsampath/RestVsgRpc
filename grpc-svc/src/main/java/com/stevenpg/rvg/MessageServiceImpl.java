package com.stevenpg.rvg;

import io.grpc.stub.StreamObserver;

public class MessageServiceImpl extends MessageServiceGrpc.MessageServiceImplBase {

    public void send(Message request, StreamObserver<Result> responseObserver) {
        Result result = Result.newBuilder().setStatus("successful").build();
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }
}
