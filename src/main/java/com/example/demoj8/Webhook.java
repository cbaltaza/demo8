package com.example.demoj8;

public class Webhook {
 private String    webhook_id;
 private String    webhook_type;
 private String    webhook_code;
 private String    link_id;
 private String    request_id;
 private String    external_id;
 private Data data;
/**
 * @return the webhook_id
 */
public String getWebhook_id() {
	return webhook_id;
}
/**
 * @return the data
 */
public Data getData() {
	return data;
}
/**
 * @param data the data to set
 */
public void setData(Data data) {
	this.data = data;
}
/**
 * @param webhook_id the webhook_id to set
 */
public void setWebhook_id(String webhook_id) {
	this.webhook_id = webhook_id;
}
/**
 * @return the webhook_type
 */
public String getWebhook_type() {
	return webhook_type;
}
/**
 * @param webhook_type the webhook_type to set
 */
public void setWebhook_type(String webhook_type) {
	this.webhook_type = webhook_type;
}
/**
 * @return the webhook_code
 */
public String getWebhook_code() {
	return webhook_code;
}
/**
 * @param webhook_code the webhook_code to set
 */
public void setWebhook_code(String webhook_code) {
	this.webhook_code = webhook_code;
}
/**
 * @return the link_id
 */
public String getLink_id() {
	return link_id;
}
/**
 * @param link_id the link_id to set
 */
public void setLink_id(String link_id) {
	this.link_id = link_id;
}
/**
 * @return the request_id
 */
public String getRequest_id() {
	return request_id;
}
/**
 * @param request_id the request_id to set
 */
public void setRequest_id(String request_id) {
	this.request_id = request_id;
}
/**
 * @return the external_id
 */
public String getExternal_id() {
	return external_id;
}
/**
 * @param external_id the external_id to set
 */
public void setExternal_id(String external_id) {
	this.external_id = external_id;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Webhook [webhook_id=");
	builder.append(webhook_id);
	builder.append(", webhook_type=");
	builder.append(webhook_type);
	builder.append(", webhook_code=");
	builder.append(webhook_code);
	builder.append(", link_id=");
	builder.append(link_id);
	builder.append(", request_id=");
	builder.append(request_id);
	builder.append(", external_id=");
	builder.append(external_id);
	builder.append("]");
	return builder.toString();
}


 

}
