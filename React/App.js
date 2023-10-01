const heading1 = React.createElement(
    "h1",
    {
        style: {
            color: "orange",
        },
        key: "1",
    },
    "Namaste React"
);
const heading2 = React.createElement(
    "h2",
    {
        key: "2",
    },
    "Namaste React"
);
const heading3 = React.createElement(
    "h3",
    {
        key: "3",
    },
    "Namaste React"
);
const container = React.createElement(
    "div",
    {
        id: "container",
    },
    [heading1, heading2, heading3]
);

const root = ReactDOM.createRoot(document.getElementById("root"));

root.render(container);
