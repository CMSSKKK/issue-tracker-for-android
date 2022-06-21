package com.ron2ader.issuetracker.controller.issuedto;

import com.ron2ader.issuetracker.controller.memberdto.MemberDto;
import com.ron2ader.issuetracker.domain.issue.Issue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor(staticName = "of")
@Getter
public class IssueSimpleResponse {

    private final MemberDto memberDto;
    private final Long issueNumber;
    private final String title;
    private final String milestoneTitle;
    private final LocalDateTime createdAt;

//    public static IssueSimpleResponse from(Issue issue) {
//        return IssueSimpleResponse.of(MemberDto.from(issue.getIssuer()), issue.getId(),
//                issue.getTitle(), issue.getCreatedAt(), issue.getMilestone());
//    }

    public static IssueSimpleResponse mockIssueSimpleResponse() {
        return IssueSimpleResponse.of(MemberDto.mockMemberDto(),
                1L,
                "mock issue title",
                "mock milestone title",
                LocalDateTime.now());
    }
}
