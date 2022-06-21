package com.ron2ader.issuetracker.controller;

import com.ron2ader.issuetracker.controller.issuedto.IssueCreateRequest;
import com.ron2ader.issuetracker.controller.issuedto.IssueDetailResponse;
import com.ron2ader.issuetracker.controller.issuedto.IssueSimpleResponse;
import com.ron2ader.issuetracker.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @PostMapping("/issues") //@Login MemberDto memberDto,
    public IssueDetailResponse register(IssueCreateRequest issueCreateRequest) {

        //ssueDetailResponse issueDetailResponse = issueService.registerIssue(issueCreateRequest.getTitle(), issueCreateRequest.getContents(), memberDto.getMemberId()); // 임시 아이디
        return IssueDetailResponse.mockIssueCreateDetailResponse();
        //return ResponseEntity.ok(issueDetailResponse);
    }

    @GetMapping("/issues/{issueNumber}")
    public IssueDetailResponse showIssue(@PathVariable Long issueNumber) {
        //IssueDetailResponse issueDetailResponse = issueService.findById(issueNumber);
        return IssueDetailResponse.mockIssueDetailResponse();
        //return ResponseEntity.ok(issueDetailResponse);
    }

    @GetMapping("/issues")
    public Page<IssueSimpleResponse> showIssuesByOpenStatus(Pageable pageable, Boolean openStatus) {

        //Page<IssueSimpleResponse> issues = issueService.findByCondition(pageable, openStatus);
        return new PageImpl<>(List.of(IssueSimpleResponse.mockIssueSimpleResponse()), pageable, 1L);
        //return ResponseEntity.ok(issues);
    }
}
