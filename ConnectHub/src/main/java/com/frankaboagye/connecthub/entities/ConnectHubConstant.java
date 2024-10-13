package com.frankaboagye.connecthub.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ConnectHubConstant {
    CONNECT_HUB_PROFILE("profile"),
    CONNECT_HUB_SESSION_DATA("sessionData"),
    CONNECT_HUB_COMPANY_DATA("companyData"),
    CONNECT_HUB_APPLICATION("connectHubApplication"),
    CONNECT_HUB_SKILL("connectHubSkill"),
    CONNECT_HUB_NOTIFICATION("connectHubNotification"),
    CONNECT_HUB_RATING("connectHubRating"),
    CONNECT_HUB_FEEDBACK("connectHubFeedback");

    private final String description;
}
