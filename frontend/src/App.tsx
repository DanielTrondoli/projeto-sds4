import BarCharts from "components/BarCharts";
import DataTable from "components/DataTable";
import DonutCharts from "components/DonutCharts";
import Footer from "components/Footer";
import NavBar from "components/Navbar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dash Board</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de Sucesso</h5>
            <BarCharts />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de Sucesso</h5>
            <DonutCharts />
          </div>
        </div>
      </div>
      <div className="py-3">
        <h2 className="text-primary">Todas as Vendas</h2>
      </div>
      <DataTable />
      <Footer />
    </>
  );
}

export default App;
