package net.devdev.service_api;

public interface AppSessionSvc {

	void createSession(String clientType, String clientId, String clientSessionId);

	void removeSession(String clientType, String clientId, String clientSessionId);

	void validateSession(String clientType, String clientId, String clientSessionId);

}
