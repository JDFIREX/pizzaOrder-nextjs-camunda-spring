import React, {useState, useTransition} from "react";
import axios from "axios";

const Page = () => {

    const [isPending, startTransition] = useTransition();
    const [pizzaName, setPizzaName] = useState("");
    const [pizzaList, setPizzaList] = useState<String[]>([]);

    const handlePizzaName = (e: React.KeyboardEvent<HTMLInputElement>) => {
        setPizzaName(e.target.value)
    }

    const handleAddToOrder = () => {
        setPizzaList((prev) => !!pizzaName ? [...prev, pizzaName] : prev);
        setPizzaName("")
    }

    const handleSubmitOrder = (e) => {
        e.preventDefault()
        startTransition(() => {
            const r = axios.post("http://localhost:8080/pizza-order", {
                body: {
                    pizzaOrder: pizzaList
                }
            }).then(r => console.log(r))
            setPizzaName("")
            setPizzaList([])
        })
    }

    return (
        <form  onSubmit={handleSubmitOrder}>
            <h2>order pizza</h2>
            <input type="text" placeholder="pizza name" onChange={handlePizzaName} value={pizzaName} />
            <button type="button" onClick={handleAddToOrder} >add to list</button>
            <label>
                <p>your pizza list</p>
                <ul>
                    {pizzaList.map((p, i) => (<li key={i} >{p}</li>))}
                </ul>
            </label>
            <button type="submit" >send order</button>
            {isPending}
            {isPending && (<p>sending order</p>)}
        </form>
    )
}

export default Page