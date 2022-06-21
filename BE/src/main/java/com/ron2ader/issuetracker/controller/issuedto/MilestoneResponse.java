package com.ron2ader.issuetracker.controller.issuedto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MilestoneResponse {

    private final String title;
    private final Double progress;

    public static MilestoneResponse mockMilestoneResponse() {
        return new MilestoneResponse("mock milestone title", 0.33);
    }
}
