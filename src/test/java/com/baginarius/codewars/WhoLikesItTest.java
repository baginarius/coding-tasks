package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.WhoLikesIt.whoLikesIt;
import static org.assertj.core.api.Assertions.assertThat;

class WhoLikesItTest {
    @Test
    public void shouldGetLikes() {
        assertThat(whoLikesIt()).isEqualTo("no one likes this");
        assertThat(whoLikesIt("Peter")).isEqualTo("Peter likes this");
        assertThat(whoLikesIt("Jacob", "Alex")).isEqualTo("Jacob and Alex like this");
        assertThat(whoLikesIt("Max", "John", "Mark")).isEqualTo("Max, John and Mark like this");
        assertThat(whoLikesIt("Alex", "Jacob", "Mark", "Max")).isEqualTo("Alex, Jacob and 2 others like this");
    }
}