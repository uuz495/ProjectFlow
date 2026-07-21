package io.github.uuz495.projectflow;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class ProjectFlowApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void getProjectsReturnsOk() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/projects"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().json("[]"))
			.andExpect(
				MockMvcResultMatchers.content()
					.contentType(MediaType.APPLICATION_JSON)
			);
	}

	@Test
	void unknownRouteReturnsNotFound() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/unknown"))
			.andExpect(MockMvcResultMatchers.status().isNotFound());
	}
}
