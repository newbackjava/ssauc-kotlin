package com.example.ssauc.user.chat.dto

import lombok.Getter
import lombok.Setter

// DTO(Data Transfer Object)를 사용해 신고 파라미터를 안전하게 받고, 엔티티로 변환하여 DB에 저장하는 전형적인 방법
//엔티티 자체를 폼 파라미터로 받는 대신, DTO를 사용해 컨트롤러 계층과 도메인(엔티티) 계층을 분리하는 방식
@Getter
@Setter
class ReportRequestDto {
    private val reporterUserId: Long? = null
    private val reportedUserId: Long? = null
    private val reportReason: String? = null
    private val details: String? = null
}
