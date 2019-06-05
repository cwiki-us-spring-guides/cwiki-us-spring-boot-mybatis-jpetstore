/*
 *    Copyright 2016-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.ossez.spring.boot.jpetstore.ui.controller;

import com.ossez.spring.boot.jpetstore.component.message.Messages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kazuki Shimizu
 */
@RequestMapping("/login")
@Controller
public class AuthController {

	@GetMapping
	public String loginForm() {
		return "auth/login";
	}

	@GetMapping(params = "error")
	public String loginError(Model model) {
		model.addAttribute(new Messages().error("Credentials is invalid"));
		return loginForm();
	}

}
