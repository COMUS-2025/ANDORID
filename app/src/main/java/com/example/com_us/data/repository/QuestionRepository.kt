package com.example.com_us.data.repository

import com.example.com_us.data.model.question.request.RequestAnswerRequest
import com.example.com_us.data.model.question.response.question.ResponseAnswerDetailDto
import com.example.com_us.data.model.question.response.question.ResponseAnswerDetailWithDateDto
import com.example.com_us.data.model.question.response.question.ResponsePreviousAnswerDto
import com.example.com_us.data.model.question.response.question.ResponseQuestionDetailDto
import com.example.com_us.data.model.question.response.question.ResponseQuestionDto

interface QuestionRepository {
    // 카테고리별 질문 리스트
    suspend fun getQuestionListByCate(category: String): Result<List<ResponseQuestionDto>>

    // 질문 상세 보기
    suspend fun getQuestionDetail(questionId: Long): Result<ResponseQuestionDetailDto>

    // 답변 상세 보기
    suspend fun getAnswerDetail(answer: String): Result<List<ResponseAnswerDetailDto>>

    //
    suspend fun postAnswer(body: RequestAnswerRequest): Result<ResponseAnswerDetailWithDateDto>

    // 이전 답변 보기
    suspend fun getPreviousAnswer(questionId: Long ): Result<ResponsePreviousAnswerDto>
}