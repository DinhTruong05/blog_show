package org.example.blog_show.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final OpenAiChatModel chatModel;

    public AiService(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String suggestTitle(String content) {
        UserMessage message = new UserMessage("Hãy gợi ý một tiêu đề hay cho bài viết sau: " + content);
        return chatModel.call(message); // trả về trực tiếp String
    }

    public String summarize(String content) {
        UserMessage message = new UserMessage("Hãy tóm tắt ngắn gọn bài viết sau: " + content);
        return chatModel.call(message); // cũng trả về String
    }
}
