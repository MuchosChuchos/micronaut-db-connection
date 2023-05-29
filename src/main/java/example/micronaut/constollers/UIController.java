package example.micronaut.constollers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/views")
public class UIController {

	@View("insurance_type_form")
	@Get("/itf")
	public HttpResponse getITForm() {
		return HttpResponse.ok();
	}

	@View("agent_form")
	@Get("/af")
	public HttpResponse getAForm() {
		return HttpResponse.ok();
	}

	@View("branch_form")
	@Get("/bf")
	public HttpResponse getBForm() {
		return HttpResponse.ok();
	}

	@View("insurance_form")
	@Get("/if")
	public HttpResponse getIForm() {
		return HttpResponse.ok();
	}

	@View("salary_form")
	@Get("/sf")
	public HttpResponse getSForm() {
		return HttpResponse.ok();
	}

}
