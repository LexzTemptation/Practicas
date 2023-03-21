import React, { Fragment } from "react";

export default function CC() {
    return (
        <Fragment>
            <div class="container-fluid">
                <br /><br /><br />
                <div class="col-12">
                    <section>
                        <div class="row justify-content-center">
                            <div class="col-3">
                                <br /><br />
                                <form class="w3-container">
                                    <div class="row justify-content-left">
                                        <div class="col-9">
                                            <input type="text" placeholder="Nombre(s)" />
                                        </div>
                                        <br /><br />
                                        <div class="col-9">
                                            <input type="text" placeholder="Apellido paterno" />
                                        </div>
                                        <br /><br />
                                        <div class="col-9">
                                            <input type="password" placeholder="Apellido materno" />
                                        </div>
                                        <br /><br />
                                        <div class="col-9">
                                            <input type="date" placeholder="Fecha de nacimiento" />
                                        </div>
                                        <br /><br />
                                        <div class="col-9">
                                            <input type="tel" placeholder="Teléfono" />
                                        </div>
                                        <br /><br />
                                        <div class="col-9">
                                            <input type="email" placeholder="Email" />
                                        </div>
                                        <br /><br />
                                        <div class="col-9">
                                            <input type="password" placeholder="Contraseña" />
                                        </div>
                                    </div>
                                    <br />
                                    <div class="row justify-content-center">
                                        <div class="col-12">
                                            <button class="btnCreateAccnt" >Crear cuenta</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="col-3">
                                <img src="user-icn.png" width="300" height="300" alt='' />
                                <div class="row justify-content-center">
                                    <div class="col-11">
                                        <h4>Ingresa tu e-mail, teléfono</h4>
                                    </div>
                                </div>
                                <div class="row justify-content-center">
                                    <div class="col-6">
                                        <h4>o usuario de</h4>
                                    </div>
                                </div>
                                <div class="row justify-content-center">
                                    <div class="col-8">
                                        <h4>CHAIN GAME STORE</h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <br /><br /><br /><br /><br />
                    </section>
                </div>
            </div>
        </Fragment>
    );
}
















