import Link from "next/link";

const Page = () => {
    return (
        <div>
            <menu>
                <ul>
                    <li><Link href="customer/order-pizza">order pizza</Link></li>
                </ul>
            </menu>
        </div>
    )
}

export default Page;