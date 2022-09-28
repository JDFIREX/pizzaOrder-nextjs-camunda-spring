import '../styles/globals.css'
import type { AppProps } from 'next/app'
import Link from "next/link";
import React from "react";

function MyApp({ Component, pageProps }: AppProps) {
  return (
      <div>
        <aside>
            <Link href="customer" >customer page</Link>
            <>{"  "}</>
            <Link href="employee" >employee page</Link>

            <br />
            <br />
            <br />
        </aside>
        <Component {...pageProps} />
      </div>
  )
}

export default MyApp
