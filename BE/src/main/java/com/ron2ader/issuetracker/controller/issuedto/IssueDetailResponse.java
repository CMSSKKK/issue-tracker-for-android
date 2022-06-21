package com.ron2ader.issuetracker.controller.issuedto;

import com.ron2ader.issuetracker.controller.memberdto.MemberDto;

import java.util.List;
import java.util.Objects;

import com.ron2ader.issuetracker.domain.milestone.QMilestone;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IssueDetailResponse {

    private final MemberDto issuer;
    private final IssueDetail issueDetail;
    private final List<ReplyResponse> replies;
    private final List<LabelResponse> labels;
    private final List<MemberDto> assignees;
    private final MilestoneResponse milestone;

    public static IssueDetailResponse mockIssueCreateDetailResponse() {
        return new IssueDetailResponse(MemberDto.mockMemberDto(), IssueDetail.mockIssueDetail(), null, null, List.of(MemberDto.mockMemberDto()), null);
    }

    public static IssueDetailResponse mockIssueDetailResponse() {
        return new IssueDetailResponse(MemberDto.mockMemberDto(), IssueDetail.mockIssueDetail(), List.of(ReplyResponse.mockReplyResponse()), List.of(LabelResponse.mockLabelResponse()), List.of(MemberDto.mockMemberDto()), MilestoneResponse.mockMilestoneResponse());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueDetailResponse that = (IssueDetailResponse) o;
        return Objects.equals(issueDetail, that.issueDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueDetail);
    }
}
