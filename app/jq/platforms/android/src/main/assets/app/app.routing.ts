import { LoginComponent } from "./pages/login/login.component";
import { ListComponent } from "./pages/list/list.component";
import { CreatePinComponent} from "./pages/pin/createpin.component"

export const routes = [
{ path: "", component: CreatePinComponent },
{ path: "login", component: LoginComponent },
{ path: "list", component: ListComponent }

];

export const navigatableComponents = [
LoginComponent,
ListComponent,
CreatePinComponent
];