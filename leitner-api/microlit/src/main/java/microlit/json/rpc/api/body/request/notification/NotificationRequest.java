package microlit.json.rpc.api.body.request.notification;

import microlit.json.rpc.api.body.request.AbstractJsonRpcRequest;
import microlit.json.rpc.api.body.request.JsonRpcRequest;
import microlit.json.rpc.api.body.response.JsonRpcResponse;
import microlit.json.rpc.api.processor.JsonRpcRequestProcessor;

public class NotificationRequest extends AbstractJsonRpcRequest implements JsonRpcRequest {

    public NotificationRequest() {
        super();
    }

    private NotificationRequest(String methodName, Object[] parameters) {
        super(methodName, parameters);
    }

    public static NotificationRequest create(String method, Object[] params) {
        return new NotificationRequest(method, params);
    }

    @Override
    public JsonRpcResponse processWith(JsonRpcRequestProcessor jsonRpcRequestProcessor) {
        return jsonRpcRequestProcessor.process(this);
    }
}
