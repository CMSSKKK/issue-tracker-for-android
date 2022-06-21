package com.ron2ader.issuetracker.controller.issuedto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LabelResponse {

    private final String name;
    private final String colorCode;

    public static LabelResponse mockLabelResponse() {
        return new LabelResponse("mock label", "mock color code");
    }
}
