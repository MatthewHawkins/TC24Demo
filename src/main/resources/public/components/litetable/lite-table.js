import { LitElement, html, css } from 'https://cdn.skypack.dev/lit-element?min';

/**
 * A simple table component
 *
 * @element lite-table
 *
 * @prop {Array} data - The data to display in the table
 * @prop {Array} columns - The columns to display in the table
 */
class LiteTable extends LitElement {
  static get properties() {
    return {
      data: { type: Array },
      columns: { type: Array },
    };
  }

  static get styles() {
    return css`
      :host {
        display: block;
      }

      .table-wrapper {
        overflow-x: auto;
      }

      table {
        border-collapse: collapse;
        width: 100%;
      }

      th,
      td {
        border-bottom: 1px solid var(--dwc-color-default);
        padding: var(--dwc-space-m);
      }

      th {
        text-align: left;
        font-weight: 500;
      }

      td {
        color: var(--dwc-color-gray-text);
      }

      tr:last-child td {
        border-bottom: none;
      }

      tbody tr:hover {
        background-color: var(--dwc-color-primary-alt);
        color: var(--dwc-color-on-primary-text-alt);
      }
    `;
  }

  constructor() {
    super();
    this.data = [];
    this.columns = [];
  }

  render() {
    return html`
      <div class="table-wrapper">
        <table>
          <thead>
            <tr>
              ${this.columns.map(column => html` <th>${column}</th> `)}
            </tr>
          </thead>
          <tbody>
            ${this.data.map(
            row => html`
            <tr>
              ${row.map(cell => html` <td>${cell}</td> `)}
            </tr>
            `,
          )}
          </tbody>
        </table>
      </div>
    `;
  }
}

customElements.define('lite-table', LiteTable);
