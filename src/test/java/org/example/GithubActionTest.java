package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GithubActionTest {

    @DisplayName("실패 테스트 -> 성공 작성")
    @Test
    void fail() {
        String test = "테스트";
        assertThat(test).isEqualTo("테스트");
    }

    @DisplayName("성공 테스트 작성")
    @Test
    void pass() {
        String test = "테스트";
        assertThat(test).isEqualTo("테스트");
    }

    @DisplayName("develop branch: 실패 테스트")
    @Test
    void developBranchFail() {
        String test = "테스트";
        assertThat(test).isEqualTo("테스트");
    }
}
