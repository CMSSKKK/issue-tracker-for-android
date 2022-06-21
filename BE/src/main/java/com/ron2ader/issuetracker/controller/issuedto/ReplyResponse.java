package com.ron2ader.issuetracker.controller.issuedto;

import com.ron2ader.issuetracker.controller.memberdto.MemberDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ReplyResponse {

    private final MemberDto memberDto;
    private final String comment;

    public static ReplyResponse mockReplyResponse() {
        return new ReplyResponse(MemberDto.mockMemberDto(), "mock comment");
    }
}
